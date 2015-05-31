package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Byte Swap
// Category: general/datamov

trait BSWAP extends InstructionDefinition {
  val mnemonic = "BSWAP"
}

object BSWAP extends OneOperand[BSWAP] with BSWAPImpl

trait BSWAPImpl extends BSWAP {
  implicit object BSWAP_0 extends _1[r16] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + rw
    val format = RegFormat
    val hasRMByte = false
  }

  implicit object BSWAP_1 extends _1[r32] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + rd
    val format = RegFormat
    val hasRMByte = false
  }

  implicit object BSWAP_2 extends _1[r64] {
    val opcode: TwoOpcodes = (0x0F, 0xC8) + ro
    override def prefix = REX.W(true)
    val format = RegFormat
    val hasRMByte = false
  }
}
