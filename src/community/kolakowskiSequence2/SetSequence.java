package community.kolakowskiSequence2;

public class SetSequence {
    public static void setDigital(int N, int A, int B){
        int[] tab = new int[N];

        tab[0]=A;
        tab[1]=B;
        tab[2]=B;

        for (int i=2; i<N; i++){
            if (i%2!=0 && tab[i]==A){
                for (int j=0; j<N; j++){
                    if (tab[j]==0){
                        tab[j]=B;
                        break;
                    }
                }
            }
            if (i%2==0 && tab[i]==A){
                for (int j=0; j<N; j++){
                    if (tab[j]==0){
                        tab[j]=A;
                        break;
                    }
                }
            }
            if (i%2!=0 && tab[i]==B){
                for (int j=0; j<N; j++){
                    if (tab[j]==0){
                        tab[j]=B;
                        if (j+1<tab.length){
                            tab[j+1]=B;
                        }
                        ;
                        break;
                    }
                }
            }
            if (i%2==0 && tab[i]==B){
                for (int j=0; j<N; j++){
                    if (tab[j]==0){
                        tab[j]=A;
                        if (j+1<tab.length){
                            tab[j+1]=A;
                        }
                        ;
                        break;
                    }
                }
            }
        }

    }
}

