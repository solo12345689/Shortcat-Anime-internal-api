.class Lnh/e$b;
.super Ljava/lang/Object;

# interfaces
.implements Lnh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnh/e$b;->a:I

    .line 5
    .line 6
    iput p2, p0, Lnh/e$b;->b:I

    .line 7
    .line 8
    iput p3, p0, Lnh/e$b;->c:I

    .line 9
    .line 10
    iput p4, p0, Lnh/e$b;->d:I

    .line 11
    .line 12
    iput p5, p0, Lnh/e$b;->e:I

    .line 13
    .line 14
    iput p6, p0, Lnh/e$b;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lnh/e$b;->a:I

    .line 2
    .line 3
    return v0
.end method
