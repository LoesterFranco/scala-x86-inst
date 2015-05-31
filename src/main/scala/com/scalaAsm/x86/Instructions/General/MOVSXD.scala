package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move with Sign-Extension
// Category: general/conver

trait MOVSXD extends InstructionDefinition {
  val mnemonic = "MOVSXD"
}

object MOVSXD extends TwoOperands[MOVSXD] with MOVSXDImpl

trait MOVSXDLow extends MOVSXD {
  implicit object MOVSXD_0 extends _2[r64, rm32] {
    val opcode: OneOpcode = 0x63 /r
    val format = RegRmFormat
    val hasRMByte = true
  }
}

trait MOVSXDImpl extends MOVSXDLow {
  implicit object MOVSXD_1 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x63 /r
    val format = RegRmFormat
    val hasRMByte = true
  }
}
