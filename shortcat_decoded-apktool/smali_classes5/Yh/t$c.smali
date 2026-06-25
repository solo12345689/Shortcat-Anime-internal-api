.class LYh/t$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYh/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private a:LYh/s;

.field private final b:LYh/s;


# direct methods
.method private constructor <init>(LYh/s;LYh/s;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYh/t$c;->a:LYh/s;

    .line 4
    iput-object p2, p0, LYh/t$c;->b:LYh/s;

    return-void
.end method

.method synthetic constructor <init>(LYh/s;LYh/s;LYh/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LYh/t$c;-><init>(LYh/s;LYh/s;)V

    return-void
.end method


# virtual methods
.method public b()LYh/s;
    .locals 2

    .line 1
    iget-object v0, p0, LYh/t$c;->a:LYh/s;

    .line 2
    .line 3
    invoke-virtual {v0}, LYh/s;->e()LYh/s;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput-object v1, p0, LYh/t$c;->a:LYh/s;

    .line 8
    .line 9
    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, LYh/t$c;->a:LYh/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LYh/t$c;->b:LYh/s;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYh/t$c;->b()LYh/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "remove"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
