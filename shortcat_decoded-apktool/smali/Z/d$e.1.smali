.class public final LZ/d$e;
.super LZ/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final c:LZ/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ/d$e;

    .line 2
    .line 3
    invoke-direct {v0}, LZ/d$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ/d$e;->c:LZ/d$e;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x4

    .line 5
    invoke-direct {p0, v2, v3, v0, v1}, LZ/d;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method protected a(LZ/e;LY/d;LY/H1;LY/u1;LZ/f;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    invoke-static {p2}, LZ/d$t;->a(I)I

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    invoke-interface {p1, p2}, LZ/e;->a(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, LY/y0;

    .line 11
    .line 12
    const/4 p3, 0x3

    .line 13
    invoke-static {p3}, LZ/d$t;->a(I)I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    invoke-interface {p1, p3}, LZ/e;->a(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    check-cast p3, LY/y0;

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    invoke-static {p3}, LZ/d$t;->a(I)I

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    invoke-interface {p1, p3}, LZ/e;->a(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, LY/y;

    .line 33
    .line 34
    const/4 p4, 0x0

    .line 35
    invoke-static {p4}, LZ/d$t;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    invoke-interface {p1, p4}, LZ/e;->a(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, LY/x0;

    .line 44
    .line 45
    invoke-virtual {p3, p2}, LY/y;->n(LY/y0;)LY/x0;

    .line 46
    .line 47
    .line 48
    const-string p1, "Could not resolve state for movable content"

    .line 49
    .line 50
    invoke-static {p1}, LY/w;->u(Ljava/lang/String;)Ljava/lang/Void;

    .line 51
    .line 52
    .line 53
    new-instance p1, LTd/k;

    .line 54
    .line 55
    invoke-direct {p1}, LTd/k;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1
.end method
