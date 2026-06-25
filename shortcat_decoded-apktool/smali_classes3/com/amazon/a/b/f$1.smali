.class Lcom/amazon/a/b/f$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/a/b/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/b/f;->a(Ljava/lang/Class;Lcom/amazon/a/a/i/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/amazon/a/b/f$c<",
        "Lcom/amazon/a/a/d/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/a/i/c;

.field final synthetic b:Lcom/amazon/a/b/f;


# direct methods
.method constructor <init>(Lcom/amazon/a/b/f;Lcom/amazon/a/a/i/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/b/f$1;->b:Lcom/amazon/a/b/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/amazon/a/b/f$1;->a:Lcom/amazon/a/a/i/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lcom/amazon/a/a/d/b;)Lcom/amazon/a/a/i/c;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/amazon/a/b/f$1;->a:Lcom/amazon/a/a/i/c;

    .line 2
    .line 3
    return-object p1
.end method
