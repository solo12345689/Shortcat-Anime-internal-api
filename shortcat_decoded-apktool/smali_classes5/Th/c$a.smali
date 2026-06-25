.class public LTh/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LTh/c$a;->a:Z

    .line 6
    .line 7
    return-void
.end method

.method static synthetic a(LTh/c$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LTh/c$a;->a:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public b()LSh/a;
    .locals 2

    .line 1
    new-instance v0, LTh/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LTh/c;-><init>(LTh/c$a;LTh/b;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
