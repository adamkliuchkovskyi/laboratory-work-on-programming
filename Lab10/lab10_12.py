class Resistor:
    def __init__(self, type_res, nominal, power, accuracy):
        self.type_res = type_res
        self.nominal = nominal
        self.power = power
        self.accuracy = accuracy
        self.left = None
        self.right = None

    def __str__(self):
        return f"Type: {self.type_res}, Nominal: {self.nominal}, Power: {self.power}, Accuracy: {self.accuracy}"

    def __repr__(self):
        return f"Type: {self.type_res}, Nominal: {self.nominal}, Power: {self.power}, Accuracy: {self.accuracy}"
    
    # вставка вузла за типом і номіналом;
    def insert(self, type_res, nominal, power, accuracy):
        if self.type_res == type_res and self.nominal == nominal:
            return
        if self.type_res > type_res:
            if self.left:
                self.left.insert(type_res, nominal, power, accuracy)
            else:
                self.left = Resistor(type_res, nominal, power, accuracy)
        else:
            if self.right:
                self.right.insert(type_res, nominal, power, accuracy)
            else:
                self.right = Resistor(type_res, nominal, power, accuracy)
    
    # вилучення всіх вузлів із заданою точністю;
    def delete(self, accuracy: list()):
        if self.left:
            self.left.delete(accuracy)
        if self.right:
            self.right.delete(accuracy)
        if self.accuracy in accuracy:
            self.type_res = None
            self.nominal = None
            self.power = None
            self.accuracy = None

    
    # вивід всіх вузлів із заданим номіналом;
    def print(self, nominal: list()):
        if self.left:
            self.left.print(nominal)
        if self.right:
            self.right.print(nominal)
        if self.nominal in nominal:
            print(self)
             
    
    # послідовний обхід дерева
    def traverse(self):
        if self.left:
            self.left.traverse()
        if self.right:
            self.right.traverse()
        if self.accuracy == None and self.nominal == None and self.power == None and self.type_res == None:
            return
        print(self)


if __name__ == "__main__":
    # вставка вузла за типом і номіналом;
    root = Resistor("OMLT", 100, 0.25, 5)
    root.insert("OMLT", 200, 0.25, 5)
    root.insert("OMLT", 300, 0.25, 5)
    root.insert("OMLT", 400, 0.25, 6)
    root.insert("OMLT", 700, 0.25, 8)
    root.insert("OMLT", 900, 0.25, 10)
    root.insert("OMLT", 1000, 0.25, 5)

    root.traverse()
    print("--------------------------------------------------------------")
    root.print([200, 300])
    print("--------------------------------------------------------------")
    root.delete([5, 6])
    root.traverse()

    # вилучення елементів
    # tree.delete(5)

    # вивід елементів
    # tree.print(6)

    # вилучення всіх вузлів із заданою точністю;
    # root.traverse()
    # print("Delete accuracy = 5")
    # root.delete(5)
    # root.traverse()

    # вивід всіх вузлів із заданим номіналом;
    # print("Print nominal = 600")
    # root.print(6)
