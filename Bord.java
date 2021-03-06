/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author dell
 */
public class Bord {
    
    private int [][]bord=new int [3][3];
    
    public void initializeBord()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                bord[i][j]=2;
            }
        }
    }
    public int getBordValue(int i,int j)
    {
        return bord[i][j];
    }
    public void setBordValue(int i,int j, int value)
    {
        bord[i][j]=value;
    }
    

    
    public int possibleWin(int player)
    {
        if(player==1)
        {
            for(int i=0;i<3;i++)
        {
            if(bord[i][0]*bord[i][1]*bord[i][2]==18)
            {
                if(bord[i][0]==2)
                {
                    return 3*i+1;
                }
                else if(bord[i][1]==2)
                {
                    return 3*i+2;
                }
                else 
                {
                    return 3*i+3;
                }
            }
        }
        //j=colume(vertical)
        for(int j=0;j<3;j++)
        {
            if(bord[0][j]*bord[1][j]*bord[2][j]==18)
            {
                if(bord[0][j]==2)
                {
                    return j+1;
                }
                else if(bord[0][j]==2){
                    return j+4;
                }
                else 
                {
                    return j+7;
                }
            }
        }
        //diagonal
        if(bord[0][0]*bord[1][1]*bord[2][2]==18)
        {
            if(bord[0][0]==2)
            {
                return 1;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 9;
            }
        }
        if(bord[0][2]*bord[1][1]*bord[2][0]==18)
        {
            if(bord[0][2]==2)
            {
                return 3;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 7;
            }
        }
        return 0;
        }
        else 
        {
            for(int i=0;i<3;i++)
        {
            if(bord[i][0]*bord[i][1]*bord[i][2]==50)
            {
                if(bord[i][0]==2)
                {
                    return 3*i+1;
                }
                else if(bord[i][1]==2)
                {
                    return 3*i+2;
                }
                else 
                {
                    return 3*i+3;
                }
            }
        }
        //j=colume(vertical)
        for(int j=0;j<3;j++)
        {
            if(bord[0][j]*bord[1][j]*bord[2][j]==50)
            {
                if(bord[0][j]==2)
                {
                    return j+1;
                }
                else if(bord[0][j]==2){
                    return j+4;
                }
                else 
                {
                    return j+7;
                }
            }
        }
        //diagonal
        if(bord[0][0]*bord[1][1]*bord[2][2]==50)
        {
            if(bord[0][0]==2)
            {
                return 1;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 9;
            }
        }
        if(bord[0][2]*bord[1][1]*bord[2][0]==50)
        {
            if(bord[0][2]==2)
            {
                return 3;
            }
            else if(bord[1][1]==2)
            {
                return 5;
            }
            else 
            {
                return 7;
            }
        }
        return 0;
        }
    }
    
    
    
    //check it the player won or not
    public boolean checkWin(int player)
    {
        if(player ==1)
        {
            for(int i=0;i<3;i++)
            {
                if(bord[i][0]*bord[i][1]*bord[i][2]==27)
                {
                    return true;
                }
            }
            for(int j=0;j<3;j++)
            {
                if(bord[0][j]*bord[1][j]*bord[2][j]==27)
                {
                    return true;
                }
            }
            if(bord[0][0]*bord[1][1]*bord[2][2]==27)
            {
                return true;
            }
            if(bord[0][2]*bord[1][1]*bord[2][0]==27)
            {
                return true;
            }
            return false;
        }
        else 
        {
            for(int i=0;i<3;i++)
            {
                if(bord[i][0]*bord[i][1]*bord[i][2]==125)
                {
                    return true;
                }
            }
            for(int j=0;j<3;j++)
            {
                if(bord[0][j]*bord[1][j]*bord[2][j]==125)
                {
                    return true;
                }
            }
            if(bord[0][0]*bord[1][1]*bord[2][2]==125)
            {
                return true;
            }
            if(bord[0][2]*bord[1][1]*bord[2][0]==125)
            {
                return true;
            }
        return false;
        }
    }
    
    public boolean isBordFilled()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(bord[i][j]==2)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int randonBlankButton()
    {
        int count=0;
        int s=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(bord[i][j]==2)
                {
                    count++;
                }
            }

         }
        int r=1+(int)Math.random()*count;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(bord[i][j]==2)
                {
                    s++;
                }
                if(r==s)
                {
                    if(i==0&&j==0)
                    {
                        return 1;
                    }
                    if(i==0&&j==1)
                    {
                        return 2;
                    }
                    if(i==0&&j==2)
                    {
                        return 3;
                    }
                    if(i==1&&j==0)
                    {
                        return 4;
                    }
                    if(i==1&&j==1)
                    {
                        return 5;
                    }
                    if(i==1&&j==2)
                    {
                        return 6;
                    }
                    if(i==2&&j==0)
                    {
                        return 7;
                    }
                    if(i==2&&j==1)
                    {
                        return 8;
                    }
                    if(i==2&&j==2)
                    {
                        return 9;
                    }
                }
            
            }   
            
        }
        return 0;
    }
}
