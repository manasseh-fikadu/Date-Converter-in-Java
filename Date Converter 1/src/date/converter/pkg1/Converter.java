/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date.converter.pkg1;

/**
 *
 * @author Minase
 */
class Converter{
    public static void ethioToGregorian(int d, int m, int y){
        int day = 30-d+2;
        int month = 0;
        int year = y+8;

        if (m==1 && d>=1 && d<=20 )
        {
            month=month+9;
            day=d+10;
            year = y+7;
        }
        else if (m==1 && d>=21 && d<=30 )
        {
            month=month+10;
            day=d-20;
            year = y+7;
        }
        else if (m==2 && d>=1 && d<=21 )
        {
            month=month+10;
            day=d+10;
            year = y+7;
        }
        else if (m==2 && d>=22 && d<=30 )
        {
            month=month+11;
            day=d-21;
            year = y+7;
        }
        else if (m==3 && d>=1 && d<=21 )
        {
            month=month+11;
            day=d+9;
            year = y+7;
        }
        else if (m==3 && d>=22 && d<=30 )
        {
            month=month+12;
            day=d-20;
            year = y+7;
        }
        else if (m==4 && d>=1 && d<=22 )
        {
            month=month+12;
            day=d+9;
            year = y+7;
        }

        else if (m==4 && d>=23 && d<=30 )
        {
            month=month+1;
            day=d-22;
            year = y+7;
        }
        else if (m==5 && d>=1 && d<=23)
        {
            month=month+1;
            day=d+8;
        }
        else if ( m==5 && d>=24 && d<=30)
        {
            month=month+2;
            day=d-23;
        }
        else if ( m==6 && d>=1 && d<=21)
        {
            month=month+2;
            day=d+7;
        }
        else if ( m==6 && d>=22 && d<=30)
        {
            month=month+3;
            day=d-21;
        }
        else if ( m==7 && d>=1 && d<=22)
        {
            month=month+3;
            day=d+9;
        }
        else if ( m==7 && d>=23 && d<=30 )
        {
            month=month+4;
            day=d-22;
        }
        else if ( m==8 && d>=1 && d<=22 )
        {
            month=month+4;
            day=d+8;
        }
        else if ( m==8 && d>=23 && d<30)
        {
            month=month+5;
            day=d-22;
        }
        else if ( m==9 && d>=1 && d<=23 )
        {
            month=month+5; 
            day=d+8;
        }
        else if ( m==9 && d>=24 && d<=30)
        {
            month=month+6;
            day=d-23;
        }
        else if ( m==10 && d>=1 && d<=23 )
        {
            month=month+6;
            day=d+7;
        }
        else if ( month==10 && d>=24 && d<=30 )
        {
            month=month+7;
            day=d-23;
        }
        else if ( m==11 && d>=1 && d<=24 )
        {
            month=month+7;
            day=d+7;
        }
        else if ( m==11 && d>=25 && d<=30 )
        {
            month=month+8;
        }
        else if ( m==8 && d<=22 )
        {
            month=month+4;
        }
        else if ( m==8 && d>=23 )
        {
            month=month+5;
        }
        else if ( m==9 && d<=23 )
        {
            month=month+5;
        }
        else if ( m==9 && d>=24 )
        {
            month=month+6;
        }
        else if ( m==10 && d<=23 )
        {
            month=month+6;
        }
        else if ( m==10 && d>=24 )
        {
            month=month+7;
        }
        else if ( m==11 && d<=24 )
        {
            month=month+7;
        }
        else if ( m==11 && d>=25 )
        {
            month=month+8;
        }
        else if ( m==12 && d<=25 )
        {
            month=month+8;
        }
        else if ( m==12 && d>=26 )
        {
            month=month+9;
        }
        else if ( m==13 && d<=5 || d<=6 )
        {
            month=month+9;
        }
        
        System.out.println("The Grogorian Date is -> " + day + " " + month + " " + year);
    }

    
    public static void gregToEthiopian(int d, int m, int y)    {
        int day = 30-d+2;
        int month=0;
        int year=y-8;

        if (m==9 && d>=6 && d<=30)
        {
            month=month+1;
            day=d-10;
            year=y-7;
        }
        else if (m==10 && d>=1 && d<=10)
        {
            month=month+1;
            day=d+20;
            year=y-7;
        }
        else if ( m==10 && d>=11 && d<=31)
        {
            month=month+2;
            day=d-10;
            year=y-7;
        }
        else if ( m==11 && d>=1 && d<=9)
        {
            month=month+2;
            day=d+21;
            year=y-7;
        }
        
        else if ( m==11 && d>=10 && d<=30 )
        {
            month=month+3;
            day=d-9;
            year=y-7;
        }
        else if ( m==12 && d>=1 && d<=9 )
        {
            month=month+3;
            day=d+21;
            year=y-7;
        }
        else if ( m==12 && d>=10 && d<=31 )
        {
            month=month+4;
            day=d-9;
            year=y-7;
        }
        else if ( m==1 && d>=1  && d<=8 )
        {
            month=month+4;
            day=d+22;
        }
        else if ( m==1 && d>=9 && d<=31 )
        {
            month=month+5;
            day=d-8;
        }
        else if ( m==2 && d>=1 && d<=7 )
        {
            month=month+5;
            day=d+23;
        }
        else if ( month==2 && d>=8 &&d<=28 )
        {
            month=month+6;
            day=d-7;
        }
        else if ( m==3 && d>=1 && d<=9 )
        {
            month=month+6;
            day=d+21;
        }
        else if ( m==3 && d>=10 && d<=31 )
        {
            month=month+7;
            day=d-9;
        }
        else if ( m==4 && d>=1 && d<=8 )
        {
            month=month+7;
            day=d+22;
        }
        else if ( m==4 && d>=9 && d<=30 )
        {
            month=month+8;
            day=d-8;
        }
        else if ( m==5 && d>=1 && d<=8 )
        {
            month=month+8;
            day=d+22;
        }
        else if ( m==5 && d>=9 && d<=31 )
        {
            month=month+9;
            day=d-8;
        }
        else if ( m==6 && d>=1 && d<=7 )
        {
            month=month+9;
            day=d+23;
        }
        else if ( m==6 && d>=8 && d<=30 )
        {
            month=month+10;
            day=d-7;
        }
        else if ( m==7 && d>=1 && d<=7 )
        {
            month=month+10;
            day=d+23;
        }
        else if ( m==7 && d>=8 && d<=31)
        {
            month=month+11;
            day=d-7;
        }
        else if ( m==8 && d>=1 && d<=6 )
        {
            month=month+11;
            day=d+24;
        }
        else if ( m==8 && d>=7 && d<=31 )
        {
            month=month+12;
            day=d-6;
        }
        else if ( m==9 && d>=1 && d<=5 )
            {
                month=month+12;
                day=d+25;
            }
        else if ( m==9 && d>=6 && d<=10 )
            {
                month=month+13;
                day=d-5;
            }

        System.out.println("The Ethiopian Date is -> " + day + " " + month + " " + year);

    };
}
