.class public final synthetic LE3/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/D;

.field public final synthetic b:LE3/A;


# direct methods
.method public synthetic constructor <init>(LE3/D;LE3/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/z;->a:LE3/D;

    .line 5
    .line 6
    iput-object p2, p0, LE3/z;->b:LE3/A;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LE3/z;->a:LE3/D;

    .line 2
    .line 3
    iget-object v1, p0, LE3/z;->b:LE3/A;

    .line 4
    .line 5
    invoke-static {v0, v1}, LE3/A$a;->a(LE3/D;LE3/A;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
