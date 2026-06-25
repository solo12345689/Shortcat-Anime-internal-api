.class public abstract Lse/P0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a(Lse/K0$a;Z)Lte/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lse/P0;->b(Lse/K0$a;Z)Lte/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final b(Lse/K0$a;Z)Lte/h;
    .locals 7

    .line 1
    sget-object v0, Lse/d0;->a:Lse/d0$a;

    invoke-virtual {v0}, Lse/d0$a;->a()LDf/p;

    move-result-object v0

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v1

    invoke-virtual {v1}, Lse/K0;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LDf/p;->h(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p0, Lte/l;->a:Lte/l;

    return-object p0

    .line 3
    :cond_0
    sget-object v0, Lse/f1;->a:Lse/f1;

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v1

    invoke-virtual {v1}, Lse/K0;->i0()Lye/Z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lse/f1;->f(Lye/Z;)Lse/p;

    move-result-object v0

    .line 4
    instance-of v1, v0, Lse/p$c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_e

    .line 5
    check-cast v0, Lse/p$c;

    invoke-virtual {v0}, Lse/p$c;->f()LVe/a$d;

    move-result-object v1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {v1}, LVe/a$d;->H()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, LVe/a$d;->C()LVe/a$c;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {v1}, LVe/a$d;->I()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, LVe/a$d;->D()LVe/a$c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v4

    invoke-virtual {v4}, Lse/K0;->U()Lse/d0;

    move-result-object v4

    .line 9
    invoke-virtual {v0}, Lse/p$c;->d()LUe/d;

    move-result-object v5

    invoke-virtual {v1}, LVe/a$c;->y()I

    move-result v6

    invoke-interface {v5, v6}, LUe/d;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-virtual {v0}, Lse/p$c;->d()LUe/d;

    move-result-object v0

    invoke-virtual {v1}, LVe/a$c;->x()I

    move-result v1

    invoke-interface {v0, v1}, LUe/d;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {v4, v5, v0}, Lse/d0;->D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v3

    :goto_1
    if-nez v0, :cond_8

    .line 12
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v0

    invoke-virtual {v0}, Lse/K0;->i0()Lye/Z;

    move-result-object v0

    invoke-static {v0}, Lbf/k;->e(Lye/u0;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v0

    invoke-virtual {v0}, Lse/K0;->i0()Lye/Z;

    move-result-object v0

    invoke-interface {v0}, Lye/D;->getVisibility()Lye/u;

    move-result-object v0

    sget-object v1, Lye/t;->d:Lye/u;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object p1

    invoke-virtual {p1}, Lse/K0;->i0()Lye/Z;

    move-result-object p1

    invoke-interface {p1}, Lye/s0;->b()Lye/m;

    move-result-object p1

    invoke-static {p1}, Lte/o;->t(Lye/m;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v0

    invoke-virtual {v0}, Lse/K0;->i0()Lye/Z;

    move-result-object v0

    invoke-static {p1, v0}, Lte/o;->m(Ljava/lang/Class;Lye/b;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 15
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lte/k$a;

    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lte/k$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 16
    :cond_4
    new-instance v0, Lte/k$b;

    invoke-direct {v0, p1}, Lte/k$b;-><init>(Ljava/lang/reflect/Method;)V

    goto/16 :goto_4

    .line 17
    :cond_5
    new-instance p1, Lse/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Underlying property of inline class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " should have a field"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_6
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v0

    invoke-virtual {v0}, Lse/K0;->k0()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 19
    invoke-static {p0, p1, v0}, Lse/P0;->c(Lse/K0$a;ZLjava/lang/reflect/Field;)Lte/i;

    move-result-object v0

    goto/16 :goto_4

    .line 20
    :cond_7
    new-instance p1, Lse/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessors or field is found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_8
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p1

    if-nez p1, :cond_a

    .line 22
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lte/i$h$a;

    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lte/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    :goto_2
    move-object v0, p1

    goto/16 :goto_4

    .line 23
    :cond_9
    new-instance p1, Lte/i$h$e;

    invoke-direct {p1, v0}, Lte/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    .line 24
    :cond_a
    invoke-static {p0}, Lse/P0;->d(Lse/K0$a;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 25
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Lte/i$h$b;

    invoke-direct {p1, v0}, Lte/i$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    .line 26
    :cond_b
    new-instance p1, Lte/i$h$f;

    invoke-direct {p1, v0}, Lte/i$h$f;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    .line 27
    :cond_c
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, Lte/i$h$c;

    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lte/i$h$c;-><init>(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V

    goto :goto_2

    .line 28
    :cond_d
    new-instance p1, Lte/i$h$g;

    invoke-direct {p1, v0}, Lte/i$h$g;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_2

    .line 29
    :cond_e
    instance-of v1, v0, Lse/p$a;

    if-eqz v1, :cond_f

    .line 30
    check-cast v0, Lse/p$a;

    invoke-virtual {v0}, Lse/p$a;->b()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lse/P0;->c(Lse/K0$a;ZLjava/lang/reflect/Field;)Lte/i;

    move-result-object v0

    goto :goto_4

    .line 31
    :cond_f
    instance-of v1, v0, Lse/p$b;

    if-eqz v1, :cond_13

    if-eqz p1, :cond_10

    .line 32
    check-cast v0, Lse/p$b;

    invoke-virtual {v0}, Lse/p$b;->b()Ljava/lang/reflect/Method;

    move-result-object p1

    goto :goto_3

    .line 33
    :cond_10
    check-cast v0, Lse/p$b;

    invoke-virtual {v0}, Lse/p$b;->c()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_12

    .line 34
    :goto_3
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, Lte/i$h$a;

    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lte/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_4

    .line 35
    :cond_11
    new-instance v0, Lte/i$h$e;

    invoke-direct {v0, p1}, Lte/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    .line 36
    :goto_4
    invoke-virtual {p0}, Lse/K0$a;->b0()Lye/Y;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {v0, p0, v2, p1, v3}, Lte/o;->j(Lte/h;Lye/b;ZILjava/lang/Object;)Lte/h;

    move-result-object p0

    return-object p0

    .line 37
    :cond_12
    new-instance p0, Lse/Y0;

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No source found for setter of Java method property: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lse/p$b;->b()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Lse/Y0;-><init>(Ljava/lang/String;)V

    throw p0

    .line 40
    :cond_13
    instance-of v1, v0, Lse/p$d;

    if-eqz v1, :cond_18

    if-eqz p1, :cond_14

    .line 41
    check-cast v0, Lse/p$d;

    invoke-virtual {v0}, Lse/p$d;->b()Lse/n$e;

    move-result-object p1

    goto :goto_5

    .line 42
    :cond_14
    check-cast v0, Lse/p$d;

    invoke-virtual {v0}, Lse/p$d;->c()Lse/n$e;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 43
    :goto_5
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object v0

    invoke-virtual {v0}, Lse/K0;->U()Lse/d0;

    move-result-object v0

    invoke-virtual {p1}, Lse/n$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lse/n$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lse/d0;->D(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_16

    .line 44
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 45
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    move-result v0

    if-eqz v0, :cond_15

    new-instance v0, Lte/i$h$a;

    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lte/i$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    return-object v0

    .line 46
    :cond_15
    new-instance p0, Lte/i$h$e;

    invoke-direct {p0, p1}, Lte/i$h$e;-><init>(Ljava/lang/reflect/Method;)V

    return-object p0

    .line 47
    :cond_16
    new-instance p1, Lse/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No accessor found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :cond_17
    new-instance p1, Lse/Y0;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No setter found for property "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lse/Y0;-><init>(Ljava/lang/String;)V

    throw p1

    .line 49
    :cond_18
    new-instance p0, LTd/r;

    invoke-direct {p0}, LTd/r;-><init>()V

    throw p0
.end method

.method private static final c(Lse/K0$a;ZLjava/lang/reflect/Field;)Lte/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lse/K0;->i0()Lye/Z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lse/P0;->g(Lye/Z;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p0}, Lse/P0;->d(Lse/K0$a;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    new-instance p0, Lte/i$f$b;

    .line 41
    .line 42
    invoke-direct {p0, p2}, Lte/i$f$b;-><init>(Ljava/lang/reflect/Field;)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    new-instance p0, Lte/i$f$d;

    .line 47
    .line 48
    invoke-direct {p0, p2}, Lte/i$f$d;-><init>(Ljava/lang/reflect/Field;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    new-instance p1, Lte/i$g$b;

    .line 59
    .line 60
    invoke-static {p0}, Lse/P0;->e(Lse/K0$a;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-direct {p1, p2, p0}, Lte/i$g$b;-><init>(Ljava/lang/reflect/Field;Z)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    new-instance p1, Lte/i$g$d;

    .line 69
    .line 70
    invoke-static {p0}, Lse/P0;->e(Lse/K0$a;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-direct {p1, p2, p0}, Lte/i$g$d;-><init>(Ljava/lang/reflect/Field;Z)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    if-eqz p1, :cond_5

    .line 79
    .line 80
    new-instance p0, Lte/i$f$e;

    .line 81
    .line 82
    invoke-direct {p0, p2}, Lte/i$f$e;-><init>(Ljava/lang/reflect/Field;)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_5
    new-instance p1, Lte/i$g$e;

    .line 87
    .line 88
    invoke-static {p0}, Lse/P0;->e(Lse/K0$a;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-direct {p1, p2, p0}, Lte/i$g$e;-><init>(Ljava/lang/reflect/Field;Z)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_6
    :goto_0
    if-eqz p1, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    new-instance p1, Lte/i$f$a;

    .line 105
    .line 106
    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {p1, p2, p0}, Lte/i$f$a;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_7
    new-instance p0, Lte/i$f$c;

    .line 115
    .line 116
    invoke-direct {p0, p2}, Lte/i$f$c;-><init>(Ljava/lang/reflect/Field;)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_8
    invoke-virtual {p0}, Lse/K0$a;->Z()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_9

    .line 125
    .line 126
    new-instance p1, Lte/i$g$a;

    .line 127
    .line 128
    invoke-static {p0}, Lse/P0;->e(Lse/K0$a;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    invoke-static {p0}, Lse/P0;->f(Lse/K0$a;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-direct {p1, p2, v0, p0}, Lte/i$g$a;-><init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_9
    new-instance p1, Lte/i$g$c;

    .line 141
    .line 142
    invoke-static {p0}, Lse/P0;->e(Lse/K0$a;)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-direct {p1, p2, p0}, Lte/i$g$c;-><init>(Ljava/lang/reflect/Field;Z)V

    .line 147
    .line 148
    .line 149
    return-object p1
.end method

.method private static final d(Lse/K0$a;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lse/K0;->i0()Lye/Z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lze/a;->getAnnotations()Lze/h;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Lse/j1;->j()LXe/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p0, v0}, Lze/h;->k0(LXe/c;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method private static final e(Lse/K0$a;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lse/K0;->i0()Lye/Z;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lye/s0;->getType()Lqf/S;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lqf/J0;->l(Lqf/S;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    xor-int/lit8 p0, p0, 0x1

    .line 18
    .line 19
    return p0
.end method

.method public static final f(Lse/K0$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lse/K0$a;->c0()Lse/K0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lse/K0;->g0()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static final g(Lye/Z;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lye/s0;->b()Lye/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContainingDeclaration(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lbf/i;->x(Lye/m;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    invoke-interface {v0}, Lye/m;->b()Lye/m;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Lbf/i;->C(Lye/m;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v3, 0x1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Lbf/i;->t(Lye/m;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return v3

    .line 37
    :cond_2
    :goto_0
    instance-of v0, p0, Lof/N;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    check-cast p0, Lof/N;

    .line 42
    .line 43
    invoke-virtual {p0}, Lof/N;->f1()LSe/o;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, LWe/h;->f(LSe/o;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    return v3

    .line 54
    :cond_3
    return v2
.end method
