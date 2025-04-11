/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

/**
 *
 * @author akash
 */
import java.rmi.*;

public interface GameSessionInterface extends Remote
{
	public int getOccupancy() throws RemoteException;
	public boolean playerJoin() throws RemoteException;
	public void playerExit() throws RemoteException;
	public String getPieceTypeAt(int x, int y) throws RemoteException;
	public int getColorAt(int x, int y) throws RemoteException;
	public boolean gameOver() throws RemoteException;
	public int getWinningPlayer() throws RemoteException;
	public int getPlayerTurn() throws RemoteException;
	public void setPlayerTurn(int t) throws RemoteException;
	public void nextPlayerTurn() throws RemoteException;
	public void resetBoard() throws RemoteException;
	public void setWinningPlayer(int p) throws RemoteException;
	public boolean swapPiece(int x1, int y1, int x2, int y2, int c)throws RemoteException;
	
}