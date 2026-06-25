.class public abstract Lx0/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/h$a;,
        Lx0/h$b;,
        Lx0/h$c;,
        Lx0/h$d;,
        Lx0/h$e;,
        Lx0/h$f;,
        Lx0/h$g;,
        Lx0/h$h;,
        Lx0/h$i;,
        Lx0/h$j;,
        Lx0/h$k;,
        Lx0/h$l;,
        Lx0/h$m;,
        Lx0/h$n;,
        Lx0/h$o;,
        Lx0/h$p;,
        Lx0/h$q;,
        Lx0/h$r;,
        Lx0/h$s;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method private constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lx0/h;->a:Z

    iput-boolean p2, p0, Lx0/h;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lx0/h;-><init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lx0/h;-><init>(ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/h;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/h;->b:Z

    .line 2
    .line 3
    return v0
.end method
