.class public LY4/s$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY4/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY4/s$c;->a:Landroid/content/res/Resources;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(LY4/r;)LY4/n;
    .locals 2

    .line 1
    new-instance p1, LY4/s;

    .line 2
    .line 3
    iget-object v0, p0, LY4/s$c;->a:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-static {}, LY4/w;->c()LY4/w;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p1, v0, v1}, LY4/s;-><init>(Landroid/content/res/Resources;LY4/n;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
