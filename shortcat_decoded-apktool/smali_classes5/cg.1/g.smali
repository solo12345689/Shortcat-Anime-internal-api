.class public Lcg/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final b:Lcg/g;


# instance fields
.field public a:Lci/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lcg/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcg/g;->b:Lcg/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lci/c;->b()Lci/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lci/d;->a()Lci/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcg/g;->a:Lci/c;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcg/g;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/g;->a:Lci/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lci/c;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcg/g;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/g;->a:Lci/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lci/c;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lcg/g;->b:Lcg/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcg/g;->a:Lci/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lci/c;->p(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
