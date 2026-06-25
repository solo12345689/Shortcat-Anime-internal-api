.class public final LWb/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LWb/c;


# instance fields
.field private final a:LWb/a;


# direct methods
.method public constructor <init>(LWb/a;)V
    .locals 1

    .line 1
    const-string v0, "activityResultsManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LWb/m;->a:LWb/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public c(LWb/d;LWb/e;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LWb/m;->a:LWb/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LWb/a;->c(LWb/d;LWb/e;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
