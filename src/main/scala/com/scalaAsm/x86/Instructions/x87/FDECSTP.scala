package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Decrement Stack-Top Pointer
// Category: general/control

trait FDECSTP extends InstructionDefinition {
  val mnemonic = "FDECSTP"
}

object FDECSTP extends ZeroOperands[FDECSTP] with FDECSTPImpl

trait FDECSTPImpl extends FDECSTP {
  implicit object FDECSTP_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
        val hasRMByte = true
  }
}
