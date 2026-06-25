.class final LDb/k$b;
.super LDb/k$e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final b:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ldg/e;)V
    .locals 1

    .line 1
    const-string v0, "fileUri"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, LDb/k$e;-><init>(Ldg/e;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LDb/k$b;->b:Landroid/net/Uri;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LDb/k$b;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method
