#include <iostream>
#include <cmath>
using namespace std;
void nya(double a, double b, double c) {
    double delta = (b * b) - (4.0 * a * c);
    cout << "It looks like: " << a << "x^2 + " << b << "x + " << c << " = 0.";
    if (delta > 0.0) {
        double x1 = ((-b) + sqrt(delta)) / (2.0 * a);
        double x2 = ((-b) - sqrt(delta)) / (2.0 * a);
        cout << "Two results: x1 = " << x1 << "; x2 = " << x2 << "." << endl;
    }
    if (delta == 0.0) {
        double x = (-b) / (2.0 * a);
        cout << "One result: x = " << x << "." << endl;
    }
    if (delta < 0.0) {
        cout << "No result." << endl;
    }
    cout << "-- Repeat again --" << endl;
}
int main() {
    double a, b, c;
    while(true) {
        cout << "Please input a = ";
        cin >> a;
        cout << "Please input b = ";
        cin >> b;
        cout << "Please input c = ";
        cin >> c;

        nya(a, b, c);
    }
    return 0;
}