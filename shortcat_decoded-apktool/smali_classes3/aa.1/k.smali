.class public final synthetic Laa/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lma/b;


# instance fields
.field public final synthetic a:Laa/n;

.field public final synthetic b:Laa/c;


# direct methods
.method public synthetic constructor <init>(Laa/n;Laa/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laa/k;->a:Laa/n;

    .line 5
    .line 6
    iput-object p2, p0, Laa/k;->b:Laa/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Laa/k;->a:Laa/n;

    .line 2
    .line 3
    iget-object v1, p0, Laa/k;->b:Laa/c;

    .line 4
    .line 5
    invoke-static {v0, v1}, Laa/n;->h(Laa/n;Laa/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
