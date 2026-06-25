.class public final Lye/X;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lye/i;

.field private final b:Ljava/util/List;

.field private final c:Lye/X;


# direct methods
.method public constructor <init>(Lye/i;Ljava/util/List;Lye/X;)V
    .locals 1

    .line 1
    const-string v0, "classifierDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "arguments"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lye/X;->a:Lye/i;

    .line 15
    .line 16
    iput-object p2, p0, Lye/X;->b:Ljava/util/List;

    .line 17
    .line 18
    iput-object p3, p0, Lye/X;->c:Lye/X;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/X;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lye/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/X;->a:Lye/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lye/X;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/X;->c:Lye/X;

    .line 2
    .line 3
    return-object v0
.end method
