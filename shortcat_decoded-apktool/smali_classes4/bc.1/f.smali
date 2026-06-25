.class public final Lbc/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "names"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lbc/f;->a:[Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbc/f;->a:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lbc/f;)Lbc/f;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lbc/f;

    .line 5
    .line 6
    iget-object v1, p0, Lbc/f;->a:[Ljava/lang/String;

    .line 7
    .line 8
    iget-object p1, p1, Lbc/f;->a:[Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v1, p1}, LUd/n;->E([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lbc/f;-><init>([Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
