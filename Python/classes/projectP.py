from numpy import *
from scipy.interpolate import *
from matplotlib import pyplot as plt


class projectP():
    
    def __init__(self):
        print("projectP initialaztion successfull")


    def regress(self):
        j = 0
        i = 1
        data = []
        count = []
        while (i != None):
            i = int(input("Enter means: "))
            if (i != None):
                data[j] = i
                j = j + 1
            for i in data:
                if (data[i] != None):
                    count[i] = data[i]
        print(data)
        
        
        # Some predictive linear regression kung foo goes here


    def regScore(self):
        data = []
        count = []
        i = 0
        flow = True
        while (flow):
            try:
                num = float(input("Enter mean (as float): "))
                data.append(num)
                count.append(i)
                i = i + 1
            except:
                print("Loser.")
                break;
                #flow = False
        print(count)
        print(data)
        p1 = polyfit(count, data,1) # Linear polyfit?  Slope and intercept?
        p2 = polyfit(count,data,2)
        p3 = polyfit(count,data,3)
        print(p1)
        plt.plot(count,data,'o')
        plt.plot(count,polyval(p1,count), 'r-')
        plt.plot(count,polyval(p2,count), 'b--')
        plt.plot(count,polyval(p3,count), 'm:')
        plt.show()
        
