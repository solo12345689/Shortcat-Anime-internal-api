.class Li8/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LU4/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/github/penfeizhou/animation/decode/b;

.field private final b:I


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/decode/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/b$b;->a:Lcom/github/penfeizhou/animation/decode/b;

    .line 5
    .line 6
    iput p2, p0, Li8/b$b;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lcom/github/penfeizhou/animation/decode/b;
    .locals 1

    .line 1
    iget-object v0, p0, Li8/b$b;->a:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li8/b$b;->b()Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget v0, p0, Li8/b$b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Li8/b$b;->a:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/b;->U()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
