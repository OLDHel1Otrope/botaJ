public static double[] linearRegression(double[][] arr){
        int rows=arr.length;
        double xmean=0;
        double ymean=0;
        for (double[] vars : arr) {
            xmean += vars[0];
            ymean += vars[1];
        }
        xmean/=rows;
        ymean/=rows;

        double k = 0;//Sum of (xi-x mean)*(yi-y mean)
        double l = 0;
        for (double[] ints : arr) {
            double ximxm = ints[0] - xmean;//(xi-x mean)
            double yimym = ints[1] - ymean;//(yi-y mean)
            k += ximxm * yimym;//(xi-x mean)(yi-y mean)
            l += ximxm * ximxm;//(xi-x mean)^2
        }
        return new double[]{k/l,ymean-(k/l)*xmean};//first digit is slope, followed by intercept
    }
