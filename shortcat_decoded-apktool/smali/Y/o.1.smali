.class public final synthetic LY/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:LY/s;

.field public final synthetic b:LY/y0;


# direct methods
.method public synthetic constructor <init>(LY/s;LY/y0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/o;->a:LY/s;

    .line 5
    .line 6
    iput-object p2, p0, LY/o;->b:LY/y0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LY/o;->a:LY/s;

    .line 2
    .line 3
    iget-object v1, p0, LY/o;->b:LY/y0;

    .line 4
    .line 5
    invoke-static {v0, v1}, LY/s;->W(LY/s;LY/y0;)LTd/L;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
