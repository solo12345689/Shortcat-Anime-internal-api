.class public final synthetic LZ/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# instance fields
.field public final synthetic a:LY/b;

.field public final synthetic b:LY/H1;

.field public final synthetic c:LZ/f;


# direct methods
.method public synthetic constructor <init>(LY/b;LY/H1;LZ/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/g;->a:LY/b;

    .line 5
    .line 6
    iput-object p2, p0, LZ/g;->b:LY/H1;

    .line 7
    .line 8
    iput-object p3, p0, LZ/g;->c:LZ/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LZ/g;->a:LY/b;

    .line 2
    .line 3
    iget-object v1, p0, LZ/g;->b:LY/H1;

    .line 4
    .line 5
    iget-object v2, p0, LZ/g;->c:LZ/f;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LZ/h;->a(LY/b;LY/H1;LZ/f;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
