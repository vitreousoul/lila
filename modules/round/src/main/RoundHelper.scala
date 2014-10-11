package lila.round

import play.api.libs.json.Json

import lila.game.{ Pov, Game }
import lila.pref.Pref
import lila.round.Env.{ current => roundEnv }

trait RoundHelper {

  def hijackEnabled(game: Game) = game.rated && roundEnv.HijackEnabled

  def moretimeSeconds = roundEnv.moretimeSeconds
}
