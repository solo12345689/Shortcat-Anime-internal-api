.class public abstract LZe/i$b;
.super LZe/a$a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field private a:LZe/d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LZe/a$a;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LZe/d;->a:LZe/d;

    .line 5
    .line 6
    iput-object v0, p0, LZe/i$b;->a:LZe/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final i()LZe/d;
    .locals 1

    .line 1
    iget-object v0, p0, LZe/i$b;->a:LZe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract j(LZe/i;)LZe/i$b;
.end method

.method public final k(LZe/d;)LZe/i$b;
    .locals 0

    .line 1
    iput-object p1, p0, LZe/i$b;->a:LZe/d;

    .line 2
    .line 3
    return-object p0
.end method
