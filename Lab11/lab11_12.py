import re
import datetime
import requests


def get_log(url: str())-> list():
    r = requests.get(url)
    log = r.text
    log = log.split('\n')
    return log

def count_get(log: list())-> int():
    count = 0
    date = datetime.datetime(2015, 5, 17, 1, 0, 0)
    end_date = datetime.datetime(2015, 5, 17, 21, 0, 0)

    # find url with presentations
    for line in log:
        if re.search('presentations', line):
            # find date
            date_line = re.search(r'\[(.*?)\]', line).group(1)
            date_line = datetime.datetime.strptime(date_line, "%d/%b/%Y:%H:%M:%S +0000")
            if date_line >= date and date_line <= end_date:
                count += 1
    return count

if __name__ == '__main__':
    url = 'https://raw.githubusercontent.com/elastic/examples/master/Common%20Data%20Formats/apache_logs/apache_logs'
    log = get_log(url)
    count = count_get(log)
    print('Кількість успішних GET запитів презентацій виконаних 17/May/2015 в проміжку між 01:00 до 21:00: ', count)