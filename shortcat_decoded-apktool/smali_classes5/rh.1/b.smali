.class public abstract Lrh/b;
.super Ljava/lang/Object;


# direct methods
.method public static a(LKg/a;Lzg/C;)LCg/b;
    .locals 10

    .line 1
    instance-of v0, p0, LLh/a;

    if-eqz v0, :cond_0

    check-cast p0, LLh/a;

    invoke-virtual {p0}, LLh/a;->c()I

    move-result v0

    invoke-static {v0}, Lrh/e;->E(I)LDg/a;

    move-result-object v0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-virtual {p0}, LLh/a;->b()[B

    move-result-object p0

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lph/b;

    if-eqz v0, :cond_1

    check-cast p0, Lph/b;

    new-instance p1, LDg/a;

    sget-object v0, LVg/g;->r:Lzg/t;

    new-instance v1, LVg/h;

    invoke-virtual {p0}, Lph/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lrh/e;->R(Ljava/lang/String;)LDg/a;

    move-result-object v2

    invoke-direct {v1, v2}, LVg/h;-><init>(LDg/a;)V

    invoke-direct {p1, v0, v1}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    new-instance v0, LCg/b;

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Lph/b;->c()[B

    move-result-object p0

    invoke-direct {v1, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v0, p1, v1}, LCg/b;-><init>(LDg/a;Lzg/e;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Lhh/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Lhh/a;

    new-instance p1, LDg/a;

    sget-object v0, LVg/g;->v:Lzg/t;

    invoke-direct {p1, v0}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Lhh/a;->b()[S

    move-result-object p0

    array-length v0, p0

    mul-int/2addr v0, v1

    new-array v0, v0, [B

    :goto_0
    array-length v1, p0

    if-eq v2, v1, :cond_2

    aget-short v1, p0, v2

    mul-int/lit8 v3, v2, 0x2

    invoke-static {v1, v0, v3}, LOh/g;->l(S[BI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance p0, LCg/b;

    new-instance v1, Lzg/n0;

    invoke-direct {v1, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {p0, p1, v1}, LCg/b;-><init>(LDg/a;Lzg/e;)V

    return-object p0

    :cond_3
    instance-of v0, p0, Ldh/k;

    const/4 v3, 0x1

    if-eqz v0, :cond_4

    check-cast p0, Ldh/k;

    invoke-static {}, Ldh/a;->f()Ldh/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Ldh/a;->i(I)Ldh/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    move-result-object v0

    invoke-virtual {v0}, Ldh/a;->b()[B

    move-result-object v0

    invoke-static {}, Ldh/a;->f()Ldh/a;

    move-result-object v1

    invoke-virtual {v1, v3}, Ldh/a;->i(I)Ldh/a;

    move-result-object v1

    invoke-virtual {p0}, Ldh/k;->m()Ldh/l;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    move-result-object p0

    invoke-virtual {p0}, Ldh/a;->b()[B

    move-result-object p0

    new-instance v1, LDg/a;

    sget-object v2, LCg/a;->R0:Lzg/t;

    invoke-direct {v1, v2}, LDg/a;-><init>(Lzg/t;)V

    new-instance v2, LCg/b;

    new-instance v3, Lzg/n0;

    invoke-direct {v3, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {v2, v1, v3, p1, p0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-object v2

    :cond_4
    instance-of v0, p0, Ldh/c;

    if-eqz v0, :cond_5

    check-cast p0, Ldh/c;

    invoke-static {}, Ldh/a;->f()Ldh/a;

    move-result-object v0

    invoke-virtual {p0}, Ldh/c;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ldh/a;->i(I)Ldh/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    move-result-object v0

    invoke-virtual {v0}, Ldh/a;->b()[B

    move-result-object v0

    invoke-static {}, Ldh/a;->f()Ldh/a;

    move-result-object v1

    invoke-virtual {p0}, Ldh/c;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Ldh/a;->i(I)Ldh/a;

    move-result-object v1

    invoke-virtual {p0}, Ldh/c;->g()Ldh/d;

    move-result-object p0

    invoke-virtual {p0}, Ldh/d;->d()Ldh/l;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldh/a;->c(LOh/c;)Ldh/a;

    move-result-object p0

    invoke-virtual {p0}, Ldh/a;->b()[B

    move-result-object p0

    new-instance v1, LDg/a;

    sget-object v2, LCg/a;->R0:Lzg/t;

    invoke-direct {v1, v2}, LDg/a;-><init>(Lzg/t;)V

    new-instance v2, LCg/b;

    new-instance v3, Lzg/n0;

    invoke-direct {v3, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {v2, v1, v3, p1, p0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-object v2

    :cond_5
    instance-of v0, p0, Lqh/f;

    if-eqz v0, :cond_6

    check-cast p0, Lqh/f;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lqh/d;->b()Lqh/e;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->T(Lqh/e;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-virtual {p0}, Lqh/f;->getEncoded()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lzg/n0;-><init>([B)V

    invoke-virtual {p0}, Lqh/f;->c()[B

    move-result-object p0

    invoke-direct {v1, v0, v2, p1, p0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-object v1

    :cond_6
    instance-of v0, p0, Lnh/f;

    if-eqz v0, :cond_7

    check-cast p0, Lnh/f;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lnh/d;->b()Lnh/e;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->L(Lnh/e;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    new-instance v1, LCg/b;

    invoke-virtual {p0}, Lnh/f;->getEncoded()[B

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, LCg/b;-><init>(LDg/a;[BLzg/C;)V

    return-object v1

    :cond_7
    instance-of v0, p0, Lkh/c;

    if-eqz v0, :cond_8

    check-cast p0, Lkh/c;

    invoke-virtual {p0}, Lkh/c;->getEncoded()[B

    move-result-object v0

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Lkh/a;->b()Lkh/b;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->C(Lkh/b;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_8
    instance-of v0, p0, LYg/g;

    if-eqz v0, :cond_9

    check-cast p0, LYg/g;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, LYg/e;->b()LYg/f;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->q(LYg/f;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    new-instance v9, LVg/b;

    invoke-virtual {p0}, LYg/g;->h()[B

    move-result-object v1

    invoke-direct {v9, v1}, LVg/b;-><init>([B)V

    new-instance v2, LVg/a;

    invoke-virtual {p0}, LYg/g;->e()[B

    move-result-object v4

    invoke-virtual {p0}, LYg/g;->d()[B

    move-result-object v5

    invoke-virtual {p0}, LYg/g;->f()[B

    move-result-object v6

    invoke-virtual {p0}, LYg/g;->c()[B

    move-result-object v7

    invoke-virtual {p0}, LYg/g;->g()[B

    move-result-object v8

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v9}, LVg/a;-><init>(I[B[B[B[B[BLVg/b;)V

    new-instance p0, LCg/b;

    invoke-direct {p0, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_9
    instance-of v0, p0, Lsh/y;

    if-eqz v0, :cond_a

    check-cast p0, Lsh/y;

    new-instance v0, LDg/a;

    sget-object v1, LVg/g;->w:Lzg/t;

    new-instance v2, LVg/k;

    invoke-virtual {p0}, Lsh/y;->c()Lsh/x;

    move-result-object v3

    invoke-virtual {v3}, Lsh/x;->b()I

    move-result v3

    invoke-virtual {p0}, Lsh/p;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lrh/e;->V(Ljava/lang/String;)LDg/a;

    move-result-object v4

    invoke-direct {v2, v3, v4}, LVg/k;-><init>(ILDg/a;)V

    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    new-instance v1, LCg/b;

    invoke-static {p0}, Lrh/b;->c(Lsh/y;)LVg/o;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_a
    instance-of v0, p0, Lsh/s;

    if-eqz v0, :cond_b

    check-cast p0, Lsh/s;

    new-instance v0, LDg/a;

    sget-object v1, LVg/g;->F:Lzg/t;

    new-instance v2, LVg/l;

    invoke-virtual {p0}, Lsh/s;->c()Lsh/r;

    move-result-object v3

    invoke-virtual {v3}, Lsh/r;->a()I

    move-result v3

    invoke-virtual {p0}, Lsh/s;->c()Lsh/r;

    move-result-object v4

    invoke-virtual {v4}, Lsh/r;->b()I

    move-result v4

    invoke-virtual {p0}, Lsh/q;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lrh/e;->V(Ljava/lang/String;)LDg/a;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, LVg/l;-><init>(IILDg/a;)V

    invoke-direct {v0, v1, v2}, LDg/a;-><init>(Lzg/t;Lzg/e;)V

    new-instance v1, LCg/b;

    invoke-static {p0}, Lrh/b;->d(Lsh/s;)LVg/m;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_b
    instance-of v0, p0, LKh/b;

    if-eqz v0, :cond_c

    check-cast p0, LKh/b;

    new-instance v0, LVg/e;

    invoke-virtual {p0}, LKh/b;->f()I

    move-result v1

    invoke-virtual {p0}, LKh/b;->e()I

    move-result v2

    invoke-virtual {p0}, LKh/b;->c()LMh/b;

    move-result-object v3

    invoke-virtual {p0}, LKh/b;->d()LMh/i;

    move-result-object v4

    invoke-virtual {p0}, LKh/b;->g()LMh/h;

    move-result-object v5

    invoke-virtual {p0}, LKh/a;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->i(Ljava/lang/String;)LDg/a;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, LVg/e;-><init>(IILMh/b;LMh/i;LMh/h;LDg/a;)V

    new-instance p0, LDg/a;

    sget-object p1, LVg/g;->n:Lzg/t;

    invoke-direct {p0, p1}, LDg/a;-><init>(Lzg/t;)V

    new-instance p1, LCg/b;

    invoke-direct {p1, p0, v0}, LCg/b;-><init>(LDg/a;Lzg/e;)V

    return-object p1

    :cond_c
    instance-of v0, p0, Lbh/e;

    if-eqz v0, :cond_d

    check-cast p0, Lbh/e;

    invoke-virtual {p0}, Lbh/e;->getEncoded()[B

    move-result-object v0

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Lbh/b;->b()Lbh/d;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->g(Lbh/d;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_d
    instance-of v0, p0, Lmh/e;

    if-eqz v0, :cond_e

    check-cast p0, Lmh/e;

    invoke-virtual {p0}, Lmh/e;->getEncoded()[B

    move-result-object v0

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Lmh/c;->b()Lmh/d;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->J(Lmh/d;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_e
    instance-of v0, p0, Lih/c;

    if-eqz v0, :cond_f

    check-cast p0, Lih/c;

    invoke-virtual {p0}, Lih/c;->getEncoded()[B

    move-result-object v0

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Lih/a;->b()Lih/b;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->w(Lih/b;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, v0}, Lzg/n0;-><init>([B)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_f
    instance-of v0, p0, Lah/c;

    if-eqz v0, :cond_10

    check-cast p0, Lah/c;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lah/a;->b()Lah/b;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->e(Lah/b;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    new-instance v7, LVg/d;

    invoke-virtual {p0}, Lah/c;->d()[B

    move-result-object v1

    invoke-direct {v7, v1}, LVg/d;-><init>([B)V

    new-instance v2, LVg/c;

    invoke-virtual {p0}, Lah/c;->f()[B

    move-result-object v4

    invoke-virtual {p0}, Lah/c;->c()[B

    move-result-object v5

    invoke-virtual {p0}, Lah/c;->e()[B

    move-result-object v6

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v7}, LVg/c;-><init>(I[B[B[BLVg/d;)V

    new-instance p0, LCg/b;

    invoke-direct {p0, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_10
    instance-of v0, p0, Lgh/f;

    if-eqz v0, :cond_13

    check-cast p0, Lgh/f;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lgh/d;->b()Lgh/e;

    move-result-object v4

    invoke-static {v4}, Lrh/e;->u(Lgh/e;)Lzg/t;

    move-result-object v4

    invoke-direct {v0, v4}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Lgh/f;->c()I

    move-result v4

    if-ne v4, v3, :cond_11

    new-instance v1, LCg/b;

    new-instance v3, Lzg/u0;

    new-instance v4, Lzg/n0;

    invoke-virtual {p0}, Lgh/f;->f()[B

    move-result-object p0

    invoke-direct {v4, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v3, v2, v2, v4}, Lzg/u0;-><init>(ZILzg/e;)V

    invoke-direct {v1, v0, v3, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_11
    invoke-virtual {p0}, Lgh/f;->c()I

    move-result v2

    if-ne v2, v1, :cond_12

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-virtual {p0}, Lgh/f;->getEncoded()[B

    move-result-object p0

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_12
    new-instance v1, LCg/b;

    invoke-virtual {p0}, Lgh/f;->f()[B

    move-result-object v2

    invoke-virtual {p0}, Lgh/f;->getEncoded()[B

    move-result-object p0

    invoke-static {v2, p0}, Lrh/b;->b([B[B)Lzg/B;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_13
    instance-of v0, p0, Ljh/c;

    if-eqz v0, :cond_14

    check-cast p0, Ljh/c;

    new-instance v0, Lzg/f;

    invoke-direct {v0}, Lzg/f;-><init>()V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/c;->c()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/c;->e()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/c;->f()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/c;->d()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Ljh/a;->b()Ljh/b;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->y(Ljh/b;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/r0;

    invoke-direct {v2, v0}, Lzg/r0;-><init>(Lzg/f;)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_14
    instance-of v0, p0, Ljh/g;

    if-eqz v0, :cond_15

    check-cast p0, Ljh/g;

    new-instance v0, Lzg/f;

    invoke-direct {v0}, Lzg/f;-><init>()V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/g;->c()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/g;->d()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/g;->f()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/g;->g()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, Lzg/n0;

    invoke-virtual {p0}, Ljh/g;->e()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lzg/n0;-><init>([B)V

    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    new-instance v1, LDg/a;

    invoke-virtual {p0}, Ljh/e;->b()Ljh/f;

    move-result-object p0

    invoke-static {p0}, Lrh/e;->P(Ljh/f;)Lzg/t;

    move-result-object p0

    invoke-direct {v1, p0}, LDg/a;-><init>(Lzg/t;)V

    new-instance p0, LCg/b;

    new-instance v2, Lzg/r0;

    invoke-direct {v2, v0}, Lzg/r0;-><init>(Lzg/f;)V

    invoke-direct {p0, v1, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object p0

    :cond_15
    instance-of v0, p0, Lfh/d;

    if-eqz v0, :cond_18

    check-cast p0, Lfh/d;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lfh/b;->b()Lfh/c;

    move-result-object v4

    invoke-static {v4}, Lrh/e;->s(Lfh/c;)Lzg/t;

    move-result-object v4

    invoke-direct {v0, v4}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Lfh/d;->c()I

    move-result v4

    if-ne v4, v3, :cond_16

    new-instance v1, LCg/b;

    new-instance v3, Lzg/u0;

    new-instance v4, Lzg/n0;

    invoke-virtual {p0}, Lfh/d;->d()[B

    move-result-object p0

    invoke-direct {v4, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v3, v2, v2, v4}, Lzg/u0;-><init>(ZILzg/e;)V

    invoke-direct {v1, v0, v3, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_16
    invoke-virtual {p0}, Lfh/d;->c()I

    move-result v2

    if-ne v2, v1, :cond_17

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-virtual {p0}, Lfh/d;->getEncoded()[B

    move-result-object p0

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_17
    new-instance v1, LCg/b;

    invoke-virtual {p0}, Lfh/d;->d()[B

    move-result-object v2

    invoke-virtual {p0}, Lfh/d;->getEncoded()[B

    move-result-object p0

    invoke-static {v2, p0}, Lrh/b;->b([B[B)Lzg/B;

    move-result-object p0

    invoke-direct {v1, v0, p0, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_18
    instance-of v0, p0, LZg/d;

    if-eqz v0, :cond_19

    check-cast p0, LZg/d;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, LZg/b;->b()LZg/c;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->c(LZg/c;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, LZg/d;->c()LZg/e;

    move-result-object v1

    new-instance v2, LCg/b;

    new-instance v3, Lzg/n0;

    invoke-virtual {p0}, LZg/d;->getEncoded()[B

    move-result-object p0

    invoke-direct {v3, p0}, Lzg/n0;-><init>([B)V

    invoke-virtual {v1}, LZg/e;->getEncoded()[B

    move-result-object p0

    invoke-direct {v2, v0, v3, p1, p0}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;[B)V

    return-object v2

    :cond_19
    instance-of v0, p0, LXg/d;

    if-eqz v0, :cond_1a

    check-cast p0, LXg/d;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, LXg/b;->b()LXg/c;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->a(LXg/c;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, LXg/d;->getEncoded()[B

    move-result-object p0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_1a
    instance-of v0, p0, Lch/e;

    if-eqz v0, :cond_1b

    check-cast p0, Lch/e;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Lch/c;->b()Lch/d;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->l(Lch/d;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Lch/e;->getEncoded()[B

    move-result-object p0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_1b
    instance-of v0, p0, Llh/g;

    if-eqz v0, :cond_1c

    check-cast p0, Llh/g;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Llh/e;->b()Llh/f;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->G(Llh/f;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Llh/g;->getEncoded()[B

    move-result-object p0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_1c
    instance-of v0, p0, Leh/c;

    if-eqz v0, :cond_1d

    check-cast p0, Leh/c;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Leh/a;->b()Leh/b;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->o(Leh/b;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Leh/c;->getEncoded()[B

    move-result-object p0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_1d
    instance-of v0, p0, Loh/b;

    if-eqz v0, :cond_1e

    check-cast p0, Loh/b;

    new-instance v0, LDg/a;

    invoke-virtual {p0}, Loh/b;->b()Loh/a;

    move-result-object v1

    invoke-static {v1}, Lrh/e;->N(Loh/a;)Lzg/t;

    move-result-object v1

    invoke-direct {v0, v1}, LDg/a;-><init>(Lzg/t;)V

    invoke-virtual {p0}, Loh/b;->getEncoded()[B

    move-result-object p0

    new-instance v1, LCg/b;

    new-instance v2, Lzg/n0;

    invoke-direct {v2, p0}, Lzg/n0;-><init>([B)V

    invoke-direct {v1, v0, v2, p1}, LCg/b;-><init>(LDg/a;Lzg/e;Lzg/C;)V

    return-object v1

    :cond_1e
    new-instance p0, Ljava/io/IOException;

    const-string p1, "key parameters not recognized"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b([B[B)Lzg/B;
    .locals 2

    .line 1
    new-instance v0, Lzg/f;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lzg/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lzg/n0;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lzg/n0;-><init>([B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lzg/f;->a(Lzg/e;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Lzg/n0;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lzg/n0;-><init>([B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lzg/f;->a(Lzg/e;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lzg/r0;

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lzg/r0;-><init>(Lzg/f;)V

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method private static c(Lsh/y;)LVg/o;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lsh/y;->getEncoded()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lsh/y;->c()Lsh/x;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lsh/x;->h()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Lsh/y;->c()Lsh/x;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lsh/x;->b()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x4

    .line 23
    invoke-static {v0, v2, v3}, Lsh/A;->a([BII)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    long-to-int v7, v4

    .line 28
    int-to-long v4, v7

    .line 29
    invoke-static {p0, v4, v5}, Lsh/A;->l(IJ)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-static {v0, v3, v1}, Lsh/A;->g([BII)[B

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    add-int/2addr v3, v1

    .line 40
    invoke-static {v0, v3, v1}, Lsh/A;->g([BII)[B

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    add-int/2addr v3, v1

    .line 45
    invoke-static {v0, v3, v1}, Lsh/A;->g([BII)[B

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    add-int/2addr v3, v1

    .line 50
    invoke-static {v0, v3, v1}, Lsh/A;->g([BII)[B

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    add-int/2addr v3, v1

    .line 55
    array-length v1, v0

    .line 56
    sub-int/2addr v1, v3

    .line 57
    invoke-static {v0, v3, v1}, Lsh/A;->g([BII)[B

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    :try_start_0
    const-class v0, Lsh/a;

    .line 62
    .line 63
    invoke-static {v12, v0}, Lsh/A;->f([BLjava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lsh/a;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    invoke-virtual {v0}, Lsh/a;->c()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v2, 0x1

    .line 74
    shl-int p0, v2, p0

    .line 75
    .line 76
    sub-int/2addr p0, v2

    .line 77
    new-instance v6, LVg/o;

    .line 78
    .line 79
    if-eq v1, p0, :cond_0

    .line 80
    .line 81
    invoke-virtual {v0}, Lsh/a;->c()I

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    invoke-direct/range {v6 .. v13}, LVg/o;-><init>(I[B[B[B[B[BI)V

    .line 86
    .line 87
    .line 88
    return-object v6

    .line 89
    :cond_0
    invoke-direct/range {v6 .. v12}, LVg/o;-><init>(I[B[B[B[B[B)V

    .line 90
    .line 91
    .line 92
    return-object v6

    .line 93
    :catch_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    new-instance v0, Ljava/io/IOException;

    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "cannot parse BDS: "

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    const-string v0, "index out of bounds"

    .line 125
    .line 126
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0
.end method

.method private static d(Lsh/s;)LVg/m;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lsh/s;->getEncoded()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lsh/s;->c()Lsh/r;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lsh/r;->f()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Lsh/s;->c()Lsh/r;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lsh/r;->a()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/lit8 v2, p0, 0x7

    .line 22
    .line 23
    div-int/lit8 v2, v2, 0x8

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v0, v3, v2}, Lsh/A;->a([BII)J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-long v5, v3

    .line 32
    invoke-static {p0, v5, v6}, Lsh/A;->l(IJ)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Lsh/A;->g([BII)[B

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    add-int/2addr v2, v1

    .line 43
    invoke-static {v0, v2, v1}, Lsh/A;->g([BII)[B

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    add-int/2addr v2, v1

    .line 48
    invoke-static {v0, v2, v1}, Lsh/A;->g([BII)[B

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    add-int/2addr v2, v1

    .line 53
    invoke-static {v0, v2, v1}, Lsh/A;->g([BII)[B

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    add-int/2addr v2, v1

    .line 58
    array-length v1, v0

    .line 59
    sub-int/2addr v1, v2

    .line 60
    invoke-static {v0, v2, v1}, Lsh/A;->g([BII)[B

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    :try_start_0
    const-class v0, Lsh/b;

    .line 65
    .line 66
    invoke-static {v11, v0}, Lsh/A;->f([BLjava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lsh/b;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    invoke-virtual {v0}, Lsh/b;->b()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    const-wide/16 v3, 0x1

    .line 77
    .line 78
    shl-long v12, v3, p0

    .line 79
    .line 80
    sub-long/2addr v12, v3

    .line 81
    cmp-long p0, v1, v12

    .line 82
    .line 83
    new-instance v4, LVg/m;

    .line 84
    .line 85
    if-eqz p0, :cond_0

    .line 86
    .line 87
    invoke-virtual {v0}, Lsh/b;->b()J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    invoke-direct/range {v4 .. v13}, LVg/m;-><init>(J[B[B[B[B[BJ)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :cond_0
    invoke-direct/range {v4 .. v11}, LVg/m;-><init>(J[B[B[B[B[B)V

    .line 96
    .line 97
    .line 98
    return-object v4

    .line 99
    :catch_0
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    new-instance v0, Ljava/io/IOException;

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v2, "cannot parse BDSStateMap: "

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    const-string v0, "index out of bounds"

    .line 131
    .line 132
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0
.end method
