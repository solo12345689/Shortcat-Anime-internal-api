.class final LC/m;
.super Landroidx/compose/ui/platform/W0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/v;
.implements LJ0/d;


# instance fields
.field private final c:LC/P;

.field private final d:Lkotlin/jvm/functions/Function2;

.field private final e:LY/C0;


# direct methods
.method public constructor <init>(LC/P;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/W0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC/m;->c:LC/P;

    .line 5
    .line 6
    iput-object p3, p0, LC/m;->d:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    const/4 p3, 0x2

    .line 10
    invoke-static {p1, p2, p3, p2}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LC/m;->e:LY/C0;

    .line 15
    .line 16
    return-void
.end method

.method private final a()LC/P;
    .locals 1

    .line 1
    iget-object v0, p0, LC/m;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC/P;

    .line 8
    .line 9
    return-object v0
.end method

.method private final c(LC/P;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC/m;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LC/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, LC/m;->c:LC/P;

    .line 12
    .line 13
    check-cast p1, LC/m;

    .line 14
    .line 15
    iget-object v3, p1, LC/m;->c:LC/P;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, LC/m;->d:Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    iget-object p1, p1, LC/m;->d:Lkotlin/jvm/functions/Function2;

    .line 26
    .line 27
    if-ne v1, p1, :cond_2

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    return v2
.end method

.method public f(LJ0/k;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC/m;->c:LC/P;

    .line 2
    .line 3
    invoke-static {}, LC/T;->a()LJ0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1, v1}, LJ0/k;->j(LJ0/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, LC/P;

    .line 12
    .line 13
    invoke-static {v0, p1}, LC/S;->d(LC/P;LC/P;)LC/P;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, LC/m;->c(LC/P;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LC/m;->c:LC/P;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LC/m;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 11

    .line 1
    iget-object v0, p0, LC/m;->d:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    invoke-direct {p0}, LC/m;->a()LC/P;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    sget-object v8, LC/m$a;->a:LC/m$a;

    .line 20
    .line 21
    const/4 v9, 0x4

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    move-object v4, p1

    .line 27
    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    const/4 v7, 0x3

    .line 33
    const/4 v8, 0x0

    .line 34
    move v5, v3

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    move v6, v5

    .line 38
    move-wide v1, p3

    .line 39
    invoke-static/range {v1 .. v8}, Li1/b;->d(JIIIIILjava/lang/Object;)J

    .line 40
    .line 41
    .line 42
    move-result-wide p3

    .line 43
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    move v3, v5

    .line 52
    new-instance v5, LC/m$b;

    .line 53
    .line 54
    invoke-direct {v5, p2}, LC/m$b;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    move-object v1, p1

    .line 61
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method
