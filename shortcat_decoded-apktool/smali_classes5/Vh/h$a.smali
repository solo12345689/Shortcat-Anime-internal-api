.class LVh/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lai/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lai/d;


# direct methods
.method public constructor <init>(Lai/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVh/h$a;->a:Lai/d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lai/d;
    .locals 1

    .line 1
    iget-object v0, p0, LVh/h$a;->a:Lai/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()LZh/g;
    .locals 2

    .line 1
    iget-object v0, p0, LVh/h$a;->a:Lai/d;

    .line 2
    .line 3
    instance-of v1, v0, LVh/s;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LVh/s;

    .line 8
    .line 9
    invoke-virtual {v0}, LVh/s;->k()LZh/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {}, LZh/g;->b()LZh/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method
