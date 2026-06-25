.class public final LE7/c$b;
.super Lle/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/c;->m(Ljava/lang/Object;)Lle/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LE7/c;


# direct methods
.method constructor <init>(Ljava/lang/Object;LE7/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LE7/c$b;->b:LE7/c;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lle/b;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected c(Lpe/m;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "property"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, LE7/c$b;->b:LE7/c;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-static {p1, p2}, LE7/c;->a(LE7/c;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LE7/c$b;->b:LE7/c;

    .line 19
    .line 20
    invoke-virtual {p1}, LE7/c;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
