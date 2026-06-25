.class final Lb0/c$a;
.super LUd/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lb0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lb0/c;

.field private final c:I

.field private final d:I

.field private e:I


# direct methods
.method public constructor <init>(Lb0/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LUd/d;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/c$a;->b:Lb0/c;

    .line 5
    .line 6
    iput p2, p0, Lb0/c$a;->c:I

    .line 7
    .line 8
    iput p3, p0, Lb0/c$a;->d:I

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p2, p3, p1}, Lf0/d;->c(III)V

    .line 15
    .line 16
    .line 17
    sub-int/2addr p3, p2

    .line 18
    iput p3, p0, Lb0/c$a;->e:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lb0/c$a;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb0/c$a;->e:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lf0/d;->a(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/c$a;->b:Lb0/c;

    .line 7
    .line 8
    iget v1, p0, Lb0/c$a;->c:I

    .line 9
    .line 10
    add-int/2addr v1, p1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public subList(II)Lb0/c;
    .locals 3

    .line 2
    iget v0, p0, Lb0/c$a;->e:I

    invoke-static {p1, p2, v0}, Lf0/d;->c(III)V

    .line 3
    new-instance v0, Lb0/c$a;

    iget-object v1, p0, Lb0/c$a;->b:Lb0/c;

    iget v2, p0, Lb0/c$a;->c:I

    add-int/2addr p1, v2

    add-int/2addr v2, p2

    invoke-direct {v0, v1, p1, v2}, Lb0/c$a;-><init>(Lb0/c;II)V

    return-object v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lb0/c$a;->subList(II)Lb0/c;

    move-result-object p1

    return-object p1
.end method
