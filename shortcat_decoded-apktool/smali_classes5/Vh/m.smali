.class public LVh/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZh/c;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:LVh/p;


# direct methods
.method public constructor <init>(Ljava/util/List;LVh/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVh/m;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, LVh/m;->b:LVh/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)LYh/p;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/m;->b:LVh/p;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVh/p;->b(Ljava/lang/String;)LYh/p;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/m;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
