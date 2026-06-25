.class public interface abstract Ls0/m1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/m1$a;,
        Ls0/m1$b;
    }
.end annotation


# static fields
.field public static final a:Ls0/m1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ls0/m1$a;->a:Ls0/m1$a;

    .line 2
    .line 3
    sput-object v0, Ls0/m1;->a:Ls0/m1$a;

    .line 4
    .line 5
    return-void
.end method

.method public static synthetic n(Ls0/m1;Ls0/m1;JILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sget-object p2, Lr0/f;->b:Lr0/f$a;

    .line 8
    .line 9
    invoke-virtual {p2}, Lr0/f$a;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Ls0/m1;->q(Ls0/m1;J)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public static synthetic p(Ls0/m1;Lr0/h;Ls0/m1$b;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Ls0/m1$b;->a:Ls0/m1$b;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Ls0/m1;->e(Lr0/h;Ls0/m1$b;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addOval"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic s(Ls0/m1;Lr0/j;Ls0/m1$b;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Ls0/m1$b;->a:Ls0/m1$b;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Ls0/m1;->k(Lr0/j;Ls0/m1$b;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addRoundRect"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic t(Ls0/m1;Lr0/h;Ls0/m1$b;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Ls0/m1$b;->a:Ls0/m1$b;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Ls0/m1;->i(Lr0/h;Ls0/m1$b;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addRect"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract C()V
.end method

.method public abstract a(FF)V
.end method

.method public abstract b(FFFFFF)V
.end method

.method public abstract c(FF)V
.end method

.method public abstract close()V
.end method

.method public abstract d()Z
.end method

.method public abstract e(Lr0/h;Ls0/m1$b;)V
.end method

.method public abstract f(FF)V
.end method

.method public abstract g(FFFFFF)V
.end method

.method public abstract getBounds()Lr0/h;
.end method

.method public abstract h(I)V
.end method

.method public abstract i(Lr0/h;Ls0/m1$b;)V
.end method

.method public abstract isEmpty()Z
.end method

.method public abstract j(FFFF)V
.end method

.method public abstract k(Lr0/j;Ls0/m1$b;)V
.end method

.method public abstract l(J)V
.end method

.method public abstract m(Ls0/m1;Ls0/m1;I)Z
.end method

.method public abstract o(FFFF)V
.end method

.method public abstract q(Ls0/m1;J)V
.end method

.method public abstract r()I
.end method

.method public abstract reset()V
.end method

.method public abstract u(FF)V
.end method
