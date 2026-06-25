.class public final synthetic LAd/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LAd/d;

.field public final synthetic b:LAd/e;


# direct methods
.method public synthetic constructor <init>(LAd/d;LAd/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LAd/c;->a:LAd/d;

    .line 5
    .line 6
    iput-object p2, p0, LAd/c;->b:LAd/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LAd/c;->a:LAd/d;

    .line 2
    .line 3
    iget-object v1, p0, LAd/c;->b:LAd/e;

    .line 4
    .line 5
    invoke-static {v0, v1}, LAd/d;->b(LAd/d;LAd/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
