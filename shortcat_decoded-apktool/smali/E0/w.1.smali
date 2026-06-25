.class public final LE0/w;
.super LE0/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LE0/x;Z)V
    .locals 6

    .line 1
    const/4 v4, 0x4

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move v2, p2

    .line 7
    invoke-direct/range {v0 .. v5}, LE0/f;-><init>(LE0/x;ZLK0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    const-string p1, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    .line 11
    .line 12
    iput-object p1, v0, LE0/w;->d:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic B()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE0/w;->T1()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public G1(LE0/x;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE0/f;->N1()LE0/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, LE0/z;->b(LE0/x;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public O1(I)Z
    .locals 2

    .line 1
    sget-object v0, LE0/Q;->a:LE0/Q$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LE0/Q$a;->c()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, LE0/Q;->g(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LE0/Q$a;->a()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p1, v0}, LE0/Q;->g(II)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public T1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/w;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
