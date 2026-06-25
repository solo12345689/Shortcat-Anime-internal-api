.class final LY/a1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/Z0;
.implements LY/C0;


# instance fields
.field private final synthetic a:LY/C0;

.field private final b:LZd/i;


# direct methods
.method public constructor <init>(LY/C0;LZd/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/a1;->a:LY/C0;

    .line 5
    .line 6
    iput-object p2, p0, LY/a1;->b:LZd/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getCoroutineContext()LZd/i;
    .locals 1

    .line 1
    iget-object v0, p0, LY/a1;->b:LZd/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY/a1;->a:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LY/a1;->a:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
