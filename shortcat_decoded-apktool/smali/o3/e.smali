.class public final synthetic Lo3/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/f;


# instance fields
.field public final synthetic a:Lo3/h;


# direct methods
.method public synthetic constructor <init>(Lo3/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo3/e;->a:Lo3/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lo3/e;->a:Lo3/h;

    .line 2
    .line 3
    check-cast p1, Lo3/t;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lo3/h;->u(Lo3/t;)Lo3/t;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
