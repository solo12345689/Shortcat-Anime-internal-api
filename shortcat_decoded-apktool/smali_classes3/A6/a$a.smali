.class public final LA6/a$a;
.super Lcom/facebook/imagepipeline/producers/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA6/a;->z()Lcom/facebook/imagepipeline/producers/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LA6/a;


# direct methods
.method constructor <init>(LA6/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA6/a$a;->b:LA6/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected g()V
    .locals 1

    .line 1
    iget-object v0, p0, LA6/a$a;->b:LA6/a;

    .line 2
    .line 3
    invoke-static {v0}, LA6/a;->w(LA6/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "throwable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA6/a$a;->b:LA6/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, LA6/a;->x(LA6/a;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected i(Ljava/lang/Object;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LA6/a$a;->b:LA6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LA6/a;->B()Lcom/facebook/imagepipeline/producers/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, p2, v1}, LA6/a;->E(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected j(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LA6/a$a;->b:LA6/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, LA6/a;->y(LA6/a;F)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
