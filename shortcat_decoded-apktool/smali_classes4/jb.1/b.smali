.class public final synthetic Ljb/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LRb/c;


# instance fields
.field public final synthetic a:Ljb/c;

.field public final synthetic b:LRb/c;


# direct methods
.method public synthetic constructor <init>(Ljb/c;LRb/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljb/b;->a:Ljb/c;

    .line 5
    .line 6
    iput-object p2, p0, Ljb/b;->b:LRb/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljb/b;->a:Ljb/c;

    .line 2
    .line 3
    iget-object v1, p0, Ljb/b;->b:LRb/c;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ljb/c;->e(Ljb/c;LRb/c;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
