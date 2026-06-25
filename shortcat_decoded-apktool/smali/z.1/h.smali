.class public final Lz/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/n;


# instance fields
.field private a:Lw/z;

.field private final b:Ll0/k;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lw/z;Ll0/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz/h;->a:Lw/z;

    .line 3
    iput-object p2, p0, Lz/h;->b:Ll0/k;

    return-void
.end method

.method public synthetic constructor <init>(Lw/z;Ll0/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Landroidx/compose/foundation/gestures/d;->e()Ll0/k;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lz/h;-><init>(Lw/z;Ll0/k;)V

    return-void
.end method


# virtual methods
.method public a(Lz/u;FLZd/e;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz/h;->c:I

    .line 3
    .line 4
    iget-object v0, p0, Lz/h;->b:Ll0/k;

    .line 5
    .line 6
    new-instance v1, Lz/h$a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p2, p0, p1, v2}, Lz/h$a;-><init>(FLz/h;Lz/u;LZd/e;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p3}, LGf/i;->g(LZd/i;Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final d()Lw/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lz/h;->a:Lw/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lz/h;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final f(Lw/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz/h;->a:Lw/z;

    .line 2
    .line 3
    return-void
.end method

.method public final g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lz/h;->c:I

    .line 2
    .line 3
    return-void
.end method
