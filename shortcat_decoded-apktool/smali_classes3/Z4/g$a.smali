.class public LZ4/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public d(LY4/r;)LY4/n;
    .locals 3

    .line 1
    new-instance v0, LZ4/g;

    .line 2
    .line 3
    const-class v1, LY4/h;

    .line 4
    .line 5
    const-class v2, Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, LY4/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LY4/n;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, LZ4/g;-><init>(LY4/n;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
