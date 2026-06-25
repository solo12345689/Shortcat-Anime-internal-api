.class public final LC/r;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/s0;


# instance fields
.field private a:Ll0/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Ll0/e$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC/r;->a:Ll0/e$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public E1(Li1/d;Ljava/lang/Object;)LC/F;
    .locals 7

    .line 1
    instance-of p1, p2, LC/F;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p2, LC/F;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    new-instance v0, LC/F;

    .line 12
    .line 13
    const/16 v5, 0xf

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct/range {v0 .. v6}, LC/F;-><init>(FZLC/l;LC/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    move-object p2, v0

    .line 24
    :cond_1
    sget-object p1, LC/l;->a:LC/l$b;

    .line 25
    .line 26
    iget-object v0, p0, LC/r;->a:Ll0/e$b;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LC/l$b;->a(Ll0/e$b;)LC/l;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p2, p1}, LC/F;->e(LC/l;)V

    .line 33
    .line 34
    .line 35
    return-object p2
.end method

.method public final F1(Ll0/e$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/r;->a:Ll0/e$b;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LC/r;->E1(Li1/d;Ljava/lang/Object;)LC/F;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
