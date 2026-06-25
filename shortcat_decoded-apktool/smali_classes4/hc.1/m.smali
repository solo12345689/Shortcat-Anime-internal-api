.class public final Lhc/m;
.super Lhc/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final d:Lpe/q;


# direct methods
.method public constructor <init>(Lpe/q;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "thisType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, Lhc/l;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lhc/m;->d:Lpe/q;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final d()Lpe/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lhc/m;->d:Lpe/q;

    .line 2
    .line 3
    return-object v0
.end method
