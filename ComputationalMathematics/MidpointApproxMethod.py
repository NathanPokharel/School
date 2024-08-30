import numpy as np
import matplotlib.pyplot as plt
from scipy.integrate import quad

def plot_function(func, a, b,title):
    """
    This function plots the graph of the input func
    within the given interval [a,b).
    """
    x = np.linspace(a, b, 1000)
    y = func(x)
    plt.plot(x, y, label='Function')
    plt.axhline(0, color='black', linewidth=0.5)
    plt.title(title)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.legend()
    plt.grid(True)
    plt.show()

def midpoint_approx(func, a, b, N):
    '''Compute the Midpoint Approximation of the definite integral of a function over the interval [a,b].

    Parameters
    ----------
    func : function
           Vectorized function of one variable
    a , b : numbers
        Endpoints of the interval [a,b]
    N : integer
        Number of subintervals of equal length in the partition of [a,b]

    Returns
    -------
    float
        Approximation of the definite integral by Midpoint Approximation.
    '''
    h = (b - a) / N
    x_midpoints = a + h * (np.arange(0, N) + 0.5)
    result = h * np.sum(func(x_midpoints))
    return result

if __name__ == "__main__":

    func_1 = lambda x: x / (x**2 + 1)
    antiderivative_1 = lambda x: 0.5 * np.log(x**2 + 1)

    func_2 = lambda x: np.exp(x)
    antiderivative_2 = lambda x: np.exp(x)

    # End points 1st Function
    a1, b1 = 0, 5  
    # End points 2nd Function
    a2, b2 = 0, 5  

    plot_function(func_1, a1, b1,"x/x^2+1")
    plot_function(func_2, a2, b2,"e^x")

    # Number of partitions 1st Function
    N1 = 100  

    # Number of partitions 2nd Function
    N2 = 500  

    midpoint_approx_1 = midpoint_approx(func_1, a1, b1, N1)
    midpoint_approx_2 = midpoint_approx(func_2, a2, b2, N2)

    definite_integral_1 = antiderivative_1(b1) - antiderivative_1(a1)  
    definite_integral_2 = antiderivative_2(b2) - antiderivative_2(a2)  

    error_1 = np.abs(midpoint_approx_1 - definite_integral_1)  
    error_2 = np.abs(midpoint_approx_2 - definite_integral_2)  

    print("width for 1st Function = {:0.6f}".format((b1 - a1) / N1))
    print("Midpoint Approximation 1st Function = {:0.6f}".format(midpoint_approx_1))
    print("Actual Value 1st Function = {:0.6f}".format(definite_integral_1))
    print("Absolute error = {:0.8f}".format(error_1))

    print("width for 2nd Function = {:0.6f}".format((b2 - a2) / N2))
    print("Midpoint Approximation 2nd Function = {:0.6f}".format(midpoint_approx_2))
    print("Actual Value 2nd Function = {:0.6f}".format(definite_integral_2))
    print("Absolute error = {:0.8f}".format(error_2))

