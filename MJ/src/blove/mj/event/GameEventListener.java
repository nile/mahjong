package blove.mj.event;

import java.util.EventListener;

import blove.mj.GameBoardView;

/**
 * 游戏事件监听器（向游戏桌注册）。
 * 
 * @author blovemaple
 */
public interface GameEventListener extends EventListener {
	/**
	 * 监听器的统一方法名。反射方式调用监听器方法时依赖此名称。
	 */
	final String METHOD_NAME = "newEvent";

	/**
	 * 有玩家进入、离开游戏，或者准备好开始游戏。
	 * 
	 * @param event
	 *            事件
	 */
	void newEvent(PlayerEvent event);

	/**
	 * 游戏开始。
	 * 
	 * @param event
	 *            事件
	 */
	void newEvent(GameStartEvent event);

	/**
	 * 限时变化。
	 * 
	 * @param event
	 *            事件
	 */
	void newEvent(TimeLimitEvent event);

	/**
	 * 发牌结束，或者有玩家摸牌、打牌、吃/碰/杠牌。<br>
	 * 注意：若在事件中有吃/碰/杠机会，则必须通过{@link GameBoardView}做出回应，要么做出吃/碰/杠动作，要么放弃。
	 * 
	 * @param event
	 *            事件
	 */
	void newEvent(PlayerActionEvent event);

	/**
	 * 游戏结束。
	 * 
	 * @param event
	 *            事件
	 */
	void newEvent(GameOverEvent event);

}