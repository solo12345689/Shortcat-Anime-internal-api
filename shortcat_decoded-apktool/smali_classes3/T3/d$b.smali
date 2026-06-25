.class final LT3/d$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:LT3/c;


# direct methods
.method public constructor <init>(LT3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT3/d$b;->a:LT3/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LT3/c;
    .locals 1

    .line 1
    iget-object v0, p0, LT3/d$b;->a:LT3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(LT3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/d$b;->a:LT3/c;

    .line 2
    .line 3
    return-void
.end method
