.class public final LK/V;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/V$c;
    }
.end annotation


# static fields
.field public static final f:LK/V$c;

.field private static final g:Lh0/v;


# instance fields
.field private final a:LY/z0;

.field private final b:LY/z0;

.field private c:Lr0/h;

.field private d:J

.field private final e:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK/V$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK/V$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK/V;->f:LK/V$c;

    .line 8
    .line 9
    sget-object v0, LK/V$a;->a:LK/V$a;

    .line 10
    .line 11
    sget-object v1, LK/V$b;->a:LK/V$b;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/b;->b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LK/V;->g:Lh0/v;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lz/q;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p2}, LY/W0;->a(F)LY/z0;

    move-result-object p2

    iput-object p2, p0, LK/V;->a:LY/z0;

    const/4 p2, 0x0

    .line 3
    invoke-static {p2}, LY/W0;->a(F)LY/z0;

    move-result-object p2

    iput-object p2, p0, LK/V;->b:LY/z0;

    .line 4
    sget-object p2, Lr0/h;->e:Lr0/h$a;

    invoke-virtual {p2}, Lr0/h$a;->a()Lr0/h;

    move-result-object p2

    iput-object p2, p0, LK/V;->c:Lr0/h;

    .line 5
    sget-object p2, LU0/W0;->b:LU0/W0$a;

    invoke-virtual {p2}, LU0/W0$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, LK/V;->d:J

    .line 6
    invoke-static {}, LY/U1;->q()LY/T1;

    move-result-object p2

    invoke-static {p1, p2}, LY/U1;->h(Ljava/lang/Object;LY/T1;)LY/C0;

    move-result-object p1

    iput-object p1, p0, LK/V;->e:LY/C0;

    return-void
.end method

.method public synthetic constructor <init>(Lz/q;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, LK/V;-><init>(Lz/q;F)V

    return-void
.end method

.method public static final synthetic a()Lh0/v;
    .locals 1

    .line 1
    sget-object v0, LK/V;->g:Lh0/v;

    .line 2
    .line 3
    return-object v0
.end method

.method private final g(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/V;->b:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/z0;->k(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(FFI)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LK/V;->d()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float p3, p3

    .line 6
    add-float v1, v0, p3

    .line 7
    .line 8
    cmpl-float v2, p2, v1

    .line 9
    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    :goto_0
    sub-float/2addr p2, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    cmpg-float v2, p1, v0

    .line 15
    .line 16
    if-gez v2, :cond_1

    .line 17
    .line 18
    sub-float v3, p2, p1

    .line 19
    .line 20
    cmpl-float v3, v3, p3

    .line 21
    .line 22
    if-lez v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-gez v2, :cond_2

    .line 26
    .line 27
    sub-float/2addr p2, p1

    .line 28
    cmpg-float p2, p2, p3

    .line 29
    .line 30
    if-gtz p2, :cond_2

    .line 31
    .line 32
    sub-float p2, p1, v0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p2, 0x0

    .line 36
    :goto_1
    invoke-virtual {p0}, LK/V;->d()F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, p2

    .line 41
    invoke-virtual {p0, p1}, LK/V;->h(F)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, LK/V;->b:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/c0;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget-object v0, p0, LK/V;->a:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/c0;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e(J)I
    .locals 3

    .line 1
    invoke-static {p1, p2}, LU0/W0;->n(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-wide v1, p0, LK/V;->d:J

    .line 6
    .line 7
    invoke-static {v1, v2}, LU0/W0;->n(J)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1, p2}, LU0/W0;->n(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-static {p1, p2}, LU0/W0;->i(J)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v1, p0, LK/V;->d:J

    .line 23
    .line 24
    invoke-static {v1, v2}, LU0/W0;->i(J)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-static {p1, p2}, LU0/W0;->i(J)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_1
    invoke-static {p1, p2}, LU0/W0;->l(J)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final f()Lz/q;
    .locals 1

    .line 1
    iget-object v0, p0, LK/V;->e:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lz/q;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/V;->a:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/z0;->k(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LK/V;->d:J

    .line 2
    .line 3
    return-void
.end method

.method public final j(Lz/q;Lr0/h;II)V
    .locals 2

    .line 1
    sub-int/2addr p4, p3

    .line 2
    int-to-float p4, p4

    .line 3
    invoke-direct {p0, p4}, LK/V;->g(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Lr0/h;->i()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, LK/V;->c:Lr0/h;

    .line 11
    .line 12
    invoke-virtual {v1}, Lr0/h;->i()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    cmpg-float v0, v0, v1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Lr0/h;->l()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, LK/V;->c:Lr0/h;

    .line 25
    .line 26
    invoke-virtual {v1}, Lr0/h;->l()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    cmpg-float v0, v0, v1

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    sget-object v0, Lz/q;->a:Lz/q;

    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2}, Lr0/h;->l()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p2}, Lr0/h;->i()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    :goto_1
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2}, Lr0/h;->e()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-virtual {p2}, Lr0/h;->j()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    :goto_2
    invoke-virtual {p0, v0, p1, p3}, LK/V;->b(FFI)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, LK/V;->c:Lr0/h;

    .line 68
    .line 69
    :goto_3
    invoke-virtual {p0}, LK/V;->d()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 p2, 0x0

    .line 74
    invoke-static {p1, p2, p4}, Loe/j;->l(FFF)F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0, p1}, LK/V;->h(F)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
