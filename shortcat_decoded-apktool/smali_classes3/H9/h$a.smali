.class LH9/h$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH9/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LH9/h;


# direct methods
.method constructor <init>(LH9/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH9/h$a;->a:LH9/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LH9/d;)LH9/d;
    .locals 2

    .line 1
    instance-of v0, p1, LH9/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v0, LH9/b;

    .line 7
    .line 8
    iget-object v1, p0, LH9/h$a;->a:LH9/h;

    .line 9
    .line 10
    invoke-static {v1}, LH9/h;->b(LH9/h;)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    neg-float v1, v1

    .line 15
    invoke-direct {v0, v1, p1}, LH9/b;-><init>(FLH9/d;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
