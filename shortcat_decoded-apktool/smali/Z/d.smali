.class public abstract LZ/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/d$a;,
        LZ/d$b;,
        LZ/d$c;,
        LZ/d$d;,
        LZ/d$e;,
        LZ/d$f;,
        LZ/d$g;,
        LZ/d$h;,
        LZ/d$i;,
        LZ/d$j;,
        LZ/d$k;,
        LZ/d$l;,
        LZ/d$m;,
        LZ/d$n;,
        LZ/d$o;,
        LZ/d$p;,
        LZ/d$q;,
        LZ/d$r;,
        LZ/d$s;,
        LZ/d$t;,
        LZ/d$u;,
        LZ/d$v;,
        LZ/d$w;,
        LZ/d$x;,
        LZ/d$y;,
        LZ/d$z;,
        LZ/d$A;,
        LZ/d$B;,
        LZ/d$C;,
        LZ/d$D;,
        LZ/d$E;,
        LZ/d$F;,
        LZ/d$G;,
        LZ/d$H;,
        LZ/d$I;,
        LZ/d$J;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LZ/d;->a:I

    iput p2, p0, LZ/d;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, LZ/d;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZ/d;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected abstract a(LZ/e;LY/d;LY/H1;LY/u1;LZ/f;)V
.end method

.method public final b(LZ/e;LY/d;LY/H1;LY/u1;LZ/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p3}, LZ/d;->c(LZ/e;LY/H1;)LY/b;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    :try_start_0
    invoke-virtual/range {p0 .. p5}, LZ/d;->a(LZ/e;LY/d;LY/H1;LY/u1;LZ/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    move-object p1, v0

    .line 11
    invoke-static {p1, p5, p3, v1}, LZ/h;->b(Ljava/lang/Throwable;LZ/f;LY/H1;LY/b;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    throw p1
.end method

.method protected c(LZ/e;LY/H1;)LY/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, LZ/d;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lpe/d;->v()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LZ/d;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ/d;->e()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
